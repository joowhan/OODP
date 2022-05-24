class VirtualProxy {

	interface Book{
		public String getName();
		public String getAuthor();
		public boolean isAvailable();
		public void showInfo();
	}

	// Original complete class:
	static class OriginalBook implements Book{
		private String name, author, description;
		private int rating;
		private boolean available;

		public OriginalBook(String n, String a, String d, int r, boolean available) {
			name = n;
			author = a;
			description = d;
			rating = r;
			this.available = available;
		}
		public String getName() {
			return name;
		}
		public String getAuthor() {
			return author;
		}
		public String getDescription() {
			return description;
		}
		public int getRating() {
			return rating;
		}
		public boolean isAvailable() {
			return available;
		}
		public void showInfo() {
			System.out.println("..:: COMPLETE BOOK ::.." +
								"\nName: " + name +
								"\nAuthor: " + author +
								"\nDescription: " + description +
								"\nRating: " + rating +
								"\nAvailability: " + available + "\n");
		}
	}

	// Proxy:
	static class ProxyBook implements Book{
		private String name, author;
		private boolean available;

		ProxyBook(String n, String a, boolean available){
	        name = n;
	        author = a;
	        this.available = available;
	    }
		public String getName() {
			return name;
		}
		public String getAuthor() {
			return author;
		}
		public boolean isAvailable() {
			return available;
		}
		public void showInfo() {
			System.out.println("..:: PROXY BOOK ::.." +
								"\nName: " + name +
								"\nAuthor: " + author +
								"\nAvailability: " + available + "\n");
		}
		public OriginalBook click() {

	        String description = "A bestselling novel";
	        int rating = 3;

	        return new OriginalBook(name, author, description, rating, available);
		}
	}
	public static void main(String[] args) {

	    Book book = new ProxyBook("Ice and Fire", "Elia Martell", true);
	    book.showInfo();

	    book = ((ProxyBook)book).click();
	    book.showInfo();
	}
}
