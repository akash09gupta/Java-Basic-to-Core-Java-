import java.awt.*;
class AwsExample extends Frame {
    AwsExample() { 
        Button b = new Button("Click me");
        b.setBounds(100,100,80,30); // setting button position
        add(b); //adding button into frame
        setSize(300,300); //frame size 300 width and 300 height
        setLayout(null); //no layout manager
        setVisible(true); //now frame will be visible, by default not visible
    }
    public static void main(String args[]) {
    AwsExample obj = new AwsExample();
}
} 