import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserLogin;
    private JPasswordField pwdUserLogin;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainPanel;

    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUserLogin.getText()
                + " " + new String(pwdUserLogin.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserLogin.setText("");
                pwdUserLogin.setText("");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
