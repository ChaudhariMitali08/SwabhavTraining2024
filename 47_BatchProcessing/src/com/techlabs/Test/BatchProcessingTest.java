package com.techlabs.Test;

import com.techlabs.Model.*;

public class BatchProcessingTest {
	public static void main(String[] args) {
		BatchProcessing batch = new BatchProcessing();
		batch.connectToDb();

		batch.batchAddSuppliers();// batch.batchAddProducts();
		batch.readSuppliers();
	}
}