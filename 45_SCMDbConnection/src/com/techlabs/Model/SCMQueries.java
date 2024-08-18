package com.techlabs.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SCMQueries {
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scmdb", "root", "root");
			statement = connection.createStatement();
			System.out.println("Connection Successfull");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query1() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Products.Name AS ProductName, Suppliers.Name AS SupplierName " +
                "FROM Products JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ProductName") + "\t" + resultSet.getString("SupplierName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void query2() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Orders.OrderID, Orders.OrderDate, Products.Name AS ProductName, OrderDetails.Quantity " +
                "FROM Orders JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID " +
                "JOIN Products ON OrderDetails.ProductID = Products.ProductID");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("OrderID") + "\t" + resultSet.getDate("OrderDate") + "\t" +
                        resultSet.getString("ProductName") + "\t" + resultSet.getInt("Quantity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void query3() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Suppliers.Name FROM Suppliers " +
                "JOIN Products ON Suppliers.SupplierID = Products.SupplierID " +
                "WHERE Products.ProductID = 1");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void query4() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Products.Name, Inventory.QuantityOnHand " +
                "FROM Products JOIN Inventory ON Products.ProductID = Inventory.ProductID");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name") + "\t" + resultSet.getInt("QuantityOnHand"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void query5() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM Orders WHERE OrderDate >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH)");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("OrderID") + "\t" + resultSet.getDate("OrderDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void query6() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Products.Name, SUM(OrderDetails.Quantity) AS TotalQuantity " +
                "FROM OrderDetails JOIN Products ON OrderDetails.ProductID = Products.ProductID " +
                "GROUP BY Products.Name");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name") + "\t" + resultSet.getInt("TotalQuantity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void query7() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Orders.OrderID, SUM(OrderDetails.Quantity * OrderDetails.Price) AS TotalAmount " +
                "FROM Orders JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID " +
                "GROUP BY Orders.OrderID");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("OrderID") + "\t" + resultSet.getDouble("TotalAmount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void query8() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Products.Name FROM Products " +
                "GROUP BY Products.Name HAVING COUNT(DISTINCT Products.SupplierID) > 1");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void query9() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Products.Name, AVG(Inventory.QuantityOnHand) AS AverageInventory " +
                "FROM Inventory JOIN Products ON Inventory.ProductID = Products.ProductID " +
                "GROUP BY Products.Name");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name") + "\t" + resultSet.getDouble("AverageInventory"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void query10() {
        try {
            ResultSet resultSet = statement.executeQuery(
                "SELECT Suppliers.Name FROM Suppliers " +
                "LEFT JOIN Products ON Suppliers.SupplierID = Products.SupplierID " +
                "WHERE Products.ProductID IS NULL");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void closeConnection() {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
