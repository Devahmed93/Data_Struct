
import java.applet.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class test extends Applet implements ActionListener {

    TextField name, pass;
    Label n, m, w;
    Button s, c;

    public void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        n = new Label("Name :");
        name = new TextField(20);
        add(n);
        add(name);

        m = new Label("Pass :");
        pass = new TextField(20);
        add(m);
        add(pass);
        s = new Button("Submit");
        add(s);
        s.addActionListener(this);
        w = new Label("please Login");
        add(w);
        c = new Button("Cancel");
        add(c);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == s) {
            if (name.getText().equals("admin") && pass.getText().equals("admin")) {
                w.setText("success");
            } else {
                w.setText("Failed");
                  w.setText("Failed");
            }
        }

    }

    public void paint(Graphics g) {
        Font f = new Font("Helvetics", Font.BOLD, 20);
        g.setFont(f);
        g.drawString("WElcome to Login APP", 30, 30);
    }

}
