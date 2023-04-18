import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.lang.model.element.TypeParameterElement;

public class main {
    public static void main(String[] args) {
        final RedBlackTree rbt = new RedBlackTree();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while(true){
                try{
                    int value = Integer.parseInt(reader.readLine());
                    rbt.add(value);
                    System.out.println("done");
                }
                catch(Exception ignored){}
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
