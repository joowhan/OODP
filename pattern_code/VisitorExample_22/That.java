//package visitPack;

class That implements Element {
	   public void   accept( Visitor v ) {
	     v.visit( this );
	   }
	   public String that() {
	     return "That";
	   }
	}
