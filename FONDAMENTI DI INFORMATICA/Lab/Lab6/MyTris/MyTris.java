public class MyTris{
    char[][] scacchiera = new char[3][3];
    
    public MyTris(){
        for(int i=0; i<scacchiera.length; i++){
            for(int j=0; j<scacchiera[0].length; j++){
                scacchiera[i][j] = '.';
            }
        }
    }
    
    public String toString(){
        String s = "";
        for(int i=0; i<scacchiera.length; i++){
            s = s + "|";
            for(int j=0; j<scacchiera[0].length; j++){
                s = s + scacchiera[i][j];
            }
            s = s + "| \n";
        }
        return s;
    }
    
    public boolean setCharInPosition(int row, int column, char c){

        if(row<scacchiera.length && column<scacchiera[0].length && row>=0 && column>=0){
            if(scacchiera[row][column] == '.'){
                scacchiera[row][column] = c;
                return true;
            }
        }
        
        return false;
    }
    
    public char getCharInPosition(int row,int column){
        if(row>=scacchiera.length || column>=scacchiera[0].length || row<0 || column<0){
            System.exit(1);
        }
        return scacchiera[row][column];
    }
    
    public int getCount(){
    
        int conto=0;
        
        for(int i=0; i<scacchiera.length; i++){
            for(int j=0; j<scacchiera[0].length; j++){
                if(scacchiera[i][j] != '.'){
                    conto++;
                }
            }
        }
        
        return conto;
    }
    
    public boolean isWinning(char c){
    
        boolean win = false;
        int count=0;
        
        for(int i=0; i<scacchiera.length; i++){
            for(int j=0; j<scacchiera[0].length; j++){
                if(scacchiera[i][j]==c){
                count++;
                }
            }
            if(count==scacchiera.length){
                win = true;
                return win;
            }
            count=0;
        }
        
        count=0;
        for(int i=0; i<scacchiera.length; i++){
            for(int j=0; j<scacchiera[0].length; j++){
                if(scacchiera[j][i]==c){
                count++;
                }
            }
            if(count==scacchiera.length){
                win = true;
                return win;
            }
            count=0;
        }
        
        count=0;
        for(int i=0; i<scacchiera.length; i++){
            if(scacchiera[i][i]==c){
                count++;
            }
        }
        if(count==scacchiera.length){
            win = true;
            return win;
        }
        
        count=0;
        for(int i=0; i<scacchiera.length; i++){
            if(scacchiera[i][scacchiera.length-1-i]==c){
                count++;
            }
        }
        if(count==scacchiera.length){
            win = true;
            return win;
        }
        
        return win;
    }
}
