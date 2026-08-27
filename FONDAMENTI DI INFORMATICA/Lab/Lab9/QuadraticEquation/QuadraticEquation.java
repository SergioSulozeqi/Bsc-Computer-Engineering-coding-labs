public class QuadraticEquation{

	private double a;
	private double b;
	private double c;
   
  	public QuadraticEquation(double acoeff, double bcoeff, double ccoeff){
		a = acoeff;
		b = bcoeff;
		c = ccoeff;
  	}

  	public double getSolution1(){
		double sol1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		return sol1;
	}

  	public double getSolution2(){
		double sol2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		return sol2;
  	}

  	public double getUniqueSolution(){
  		return -c/b;
  	}

  	public boolean hasSolutions(){
		double discriminante = b*b-4*a*c;
		if(discriminante<0 || (a==0 && b==0 && c!=0)){
			return false;
		}
		return true;
  	}

  	public boolean hasUniqueSolution(){
  		if(a==0 && b!=0){
  			return true;
  		}
  		return false;
  	}

  	public boolean hasInfiniteSolutions(){
  		if(a==0 && b==0 && c==0){
  			return true;
  		}
  		return false;
  	}



}