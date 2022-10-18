package Object;
public class PhoneNumberUtility {
    public static String removeUselessSymbols(String phoneNumber) {
        return phoneNumber.replace("-", "")
                .replace("(", "")
                .replace(")", "");
    }

    public static String validateCountryCode(String phoneNumber) {
        if (phoneNumber.startsWith("8")) {
            return phoneNumber.replaceFirst("8", "+7");
        } else if (phoneNumber.startsWith("7")) {
            return "+" + phoneNumber;
        }
        return phoneNumber;
    }

    public static void printOperatorByPhone(String phoneNumber) {
        String operatorCode = null;
        if (phoneNumber.startsWith("8")) {
            operatorCode = phoneNumber.substring(1, 4);
        } else if (phoneNumber.startsWith("+7")) {
            operatorCode = phoneNumber.substring(2, 5);
        }

        if (operatorCode == null) {
            System.out.println("Invalid phone number");
            return;
        }

        switch (operatorCode) {
            case "916":
                System.out.println("MTS");
                break;
            case "925":
                System.out.println("MegaFon");
                break;
            case "903":
                System.out.println("Beeline");
        }
    }
    public static void main(String[] args) {
        String phoneNumber = "8(916)-111-11-11";
        System.out.println(PhoneNumberUtility.removeUselessSymbols(phoneNumber));
        System.out.println(PhoneNumberUtility.validateCountryCode(phoneNumber));
    }


}
