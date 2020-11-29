package day34;

public class Apple {
	String color;
	
	public Apple(String color) {
		this.color = color;
	}
	
	public Apple() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + "]";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Apple appleObj = (Apple) obj;
//		
//		if (appleObj.color.equals(this.color)) {
//			return true;
//		} 
//		return false;
//	}
	
}
