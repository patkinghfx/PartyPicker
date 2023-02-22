import javax.swing.*;

public class Friend extends Person {

    String foodToBring;

    public Friend(String firstName, String lastName, int isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
    }

    private String inviteStatus() {
        int invited = isInvited();
        if (invited == 0) {
            System.out.print("They are invited to the party.");
        } else {
            System.out.print("They are NOT invited to the party.");
        }
        return null;
    }

        @Override
        public String toString() {
            JOptionPane.showMessageDialog(null, getFullName() + " is bringing " + this.foodToBring + ". " + inviteStatus(), "Guest List", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
