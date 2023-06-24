package com.cg.Lamdas;

public class Product implements Comparable<Product> {
		private int productId;
		private String productName;
		private float price;
		private float ratings;
		public Product(int productId, String productName, float price, float ratings) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.ratings = ratings;
		}
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", ratings="
					+ ratings + "]";
			
		}
		public int getProductId() {
			return productId;
		}
		public String getProductName() {
			return productName;
		}
		public float getPrice() {
			return price;
		}
		public float getRatings() {
			return ratings;
		}
		public int compareTo(Product p) {
			/*if(this.price<p.price) 
				return 0;
			else
				return -1;*/
			
			return this.price <p.price?-1:1;

		}

		}


