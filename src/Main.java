import javax.swing.*;

import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Main {
    public static void main(String[] args) {

        Friend[] friends = new Friend[10];

        JOptionPane.showMessageDialog(null, "Welcome to Pat's Party Picker. Follow the prompts to add up to 10 guests.", "Pat's Party Picker", JOptionPane.INFORMATION_MESSAGE);

        int cont;
        do {
            Friend newGuest = new Friend(JOptionPane.showInputDialog("Enter Guest's First Name"),
                    JOptionPane.showInputDialog("Enter Guest's Last Name"),
                    JOptionPane.showConfirmDialog(null, "Is this person invited?", "Invitation", YES_NO_OPTION),
                    JOptionPane.showInputDialog("Which food is this Guest Bringing?"));

            for (int i = 0; i < 10; i++) {
                friends[i] = newGuest;
            }

            cont = JOptionPane.showConfirmDialog(null, "Would you like to add a guest?", "Add Guest", YES_NO_OPTION);
        }
        while (cont == 0);

        if (cont != 0) {
            for (Friend i : friends) {
                friends.toString();
            }

        }
    }
    }