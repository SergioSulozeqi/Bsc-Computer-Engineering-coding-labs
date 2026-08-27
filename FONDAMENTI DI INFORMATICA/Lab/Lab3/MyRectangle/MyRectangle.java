public class MyRectangle{

	double x,y,width,height;

	public MyRectangle(int posX, int posY, int w, int h){
		x=posX;
		y=posY;
		width=w;
		height=h;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double getWidth(){
		return width;
	}

	public double getHeight(){
		return height;
	}

	public void resize(double mult){
		width*=mult;
		height*=mult;
	}

	public void translate(int dx,int dy){
		x+=dx;
		y+=dy;
	}

	public String toString(){
		String s = "il rettangolo si trova in posizione (" + x + "," + y + ") e le sue misure sono " + width + "x" + height;
		return s;
	}
}