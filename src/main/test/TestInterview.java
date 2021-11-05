
public class TestInterview {


    public static void main(String[] args) {
        String APPOINTMENT_DETAILS = "INSERT\n" +
                "INTO APPOINTMENT_DETAILS\n" +
                "  (\n" +
                "    PATIENT_NAME ,\n" +
                "    EMAIL_ADDRESS ,\n" +
                "    PHONE_NUMBER ,\n" +
                "    AGE ,\n" +
                "    GENDER ,\n" +
                "    PATIENT_CITY ,\n" +
                "    PATIENT_STATE ,\n" +
                "    TYPEOFILLNESS ,\n" +
                "    SYMPTOMS ,\n" +
                "    DESCRIPTION ,\n" +
                "    APPOINTMENTDATE ,\n" +
                "    APPOINTMENTTIME ,\n" +
                "    MODEOFAPPOINTMENT ,\n" +
                "    MEDICALHISTORY\n" +
                "  )\n" +
                "  VALUES\n" +
                "  (\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ? ,\n" +
                "    ?\n" +
                "  )";
        System.out.println(APPOINTMENT_DETAILS);
        StringBuilder stringBuilder = new StringBuilder(APPOINTMENT_DETAILS);
        System.out.println(APPOINTMENT_DETAILS);

        System.out.println(stringBuilder);

    }


}
