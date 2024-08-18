package com.techlabs.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SCM {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;

    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scmdb", "root", "root");
            statement = connection.createStatement();
            System.out.println("Connected to the database successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoSuppliers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SupplierID:");
        int supplierID = sc.nextInt();
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter ContactInfo:");
        String contactInfo = sc.next();
        System.out.println("Enter Address:");
        String address = sc.next();

        String query = "INSERT INTO suppliers (SupplierID, Name, ContactInfo, Address) VALUES (?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, supplierID);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, contactInfo);
            preparedStatement.setString(4, address);
            preparedStatement.executeUpdate();
            System.out.println("Supplier added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ProductID:");
        int productID = sc.nextInt();
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter Description:");
        String description = sc.next();
        System.out.println("Enter SupplierID:");
        int supplierID = sc.nextInt();

        String query = "INSERT INTO products (ProductID, Name, Description, SupplierID) VALUES (?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, productID);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, description);
            preparedStatement.setInt(4, supplierID);
            preparedStatement.executeUpdate();
            System.out.println("Product added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoOrders() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OrderID:");
        int orderID = sc.nextInt();
        System.out.println("Enter OrderDate (YYYY-MM-DD):");
        String orderDate = sc.next();
        System.out.println("Enter SupplierID:");
        int supplierID = sc.nextInt();

        String query = "INSERT INTO orders (OrderID, OrderDate, SupplierID) VALUES (?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, orderID);
            preparedStatement.setString(2, orderDate);
            preparedStatement.setInt(3, supplierID);
            preparedStatement.executeUpdate();
            System.out.println("Order added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoOrderDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OrderDetailID:");
        int orderDetailID = sc.nextInt();
        System.out.println("Enter OrderID:");
        int orderID = sc.nextInt();
        System.out.println("Enter ProductID:");
        int productID = sc.nextInt();
        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();
        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        String query = "INSERT INTO orderdetails (OrderDetailID, OrderID, ProductID, Quantity, Price) VALUES (?, ?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, orderDetailID);
            preparedStatement.setInt(2, orderID);
            preparedStatement.setInt(3, productID);
            preparedStatement.setInt(4, quantity);
            preparedStatement.setDouble(5, price);
            preparedStatement.executeUpdate();
            System.out.println("Order detail added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoInventory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter InventoryID:");
        int inventoryID = sc.nextInt();
        System.out.println("Enter ProductID:");
        int productID = sc.nextInt();
        System.out.println("Enter QuantityOnHand:");
        int quantityOnHand = sc.nextInt();

        String query = "INSERT INTO inventory (InventoryID, ProductID, QuantityOnHand) VALUES (?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, inventoryID);
            preparedStatement.setInt(2, productID);
            preparedStatement.setInt(3, quantityOnHand);
            preparedStatement.executeUpdate();
            System.out.println("Inventory added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchFromSuppliers() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM suppliers");
            while (rs.next()) {
                System.out.println(rs.getInt("SupplierID") + "\t" + rs.getString("Name") + "\t" + rs.getString("ContactInfo") + "\t" + rs.getString("Address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchFromProducts() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                System.out.println(rs.getInt("ProductID") + "\t" + rs.getString("Name") + "\t" + rs.getString("Description") + "\t" + rs.getInt("SupplierID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchFromOrders() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM orders");
            while (rs.next()) {
                System.out.println(rs.getInt("OrderID") + "\t" + rs.getString("OrderDate") + "\t" + rs.getInt("SupplierID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchFromOrderDetails() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM orderdetails");
            while (rs.next()) {
                System.out.println(rs.getInt("OrderDetailID") + "\t" + rs.getInt("OrderID") + "\t" + rs.getInt("ProductID") + "\t" + rs.getInt("Quantity") + "\t" + rs.getDouble("Price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchFromInventory() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM inventory");
            while (rs.next()) {
                System.out.println(rs.getInt("InventoryID") + "\t" + rs.getInt("ProductID") + "\t" + rs.getInt("QuantityOnHand"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
