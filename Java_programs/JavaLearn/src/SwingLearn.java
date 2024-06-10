import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLearn extends Frame implements ActionListener {
    public static void main(String[] args) {



    }
    TextField textField;
    void ActionListenerExample()
    {
        textField =new TextField();
        textField.setBounds(60,50,170,20);
        Button button=new Button("click me");
        button.setBounds(100,120,80,30);

        button.addActionListener(this);
        add(button);
        add(textField);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("VIKRAM YOU BUTTON IS CLICKED");
    }
}