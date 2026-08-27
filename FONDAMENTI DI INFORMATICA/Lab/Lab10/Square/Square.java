import java.awt.Rectangle;
public class Square extends Rectangle{

    public Square(int cordx, int cordy, int lato){
        super();
        super.setSize(lato,lato);
        super.setLocation((int)(cordx-lato/2),(int)(cordy-lato/2));
    }
    
    public int getArea(){
        int area = height*width;
        return area;
    }
    
    public void setSize(int width, int height){
        if(width==height){
        super.setSize(width,height);
        return ;
        }
        else{
        throw new IllegalArgumentException();
        }
    }
    
    public void setSize(int dim){
        super.setSize(dim,dim);
    }
}
