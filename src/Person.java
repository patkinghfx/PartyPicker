public class Person {

        private String firstName;
        private String lastName;
        private int isInvited;

        public Person(String firstName, String lastName, int isInvited) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.isInvited = isInvited;
        }

        public int isInvited() {
                return isInvited;
        }

        public String getFullName() {
                System.out.print(this.firstName + " " + this.lastName);
                return null;
        }
}
