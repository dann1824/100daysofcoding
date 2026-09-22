
public class DayXXI {
    
    public static void main(String[] args) {
        
        String strByte = "110";
        byte NilaiByte = Byte.parseByte(strByte);
        
        String strShort = "2000";
        short NilaiShort = Short.parseShort(strShort);
        
        String strInt = "223344";
        int NilaiInt = Integer.parseInt(strInt);
        
        String strLong= "37871631";
        long NilaiLong = Long.parseLong(strLong);
        
        String strFloat = "23.2";
        float NilaiFloat = Float.parseFloat(strFloat);
        
        String strDouble = "89.23";
        double NilaiDouble = Double.parseDouble(strDouble);
        
        String strChar = "B";
        char NilaiChar = strChar.charAt(0);
        
        String strBoolean = "true";
        boolean nilaiBool = Boolean.parseBoolean(strBoolean);
        
        System.out.println(">>> \033[1mCONTOH HASILNYA\033[0m <<<");
        System.out.println(NilaiByte);
        System.out.println(NilaiShort);
        System.out.println(NilaiInt);
        System.out.println(NilaiLong);
        
        System.out.println(NilaiFloat);
        System.out.println(NilaiDouble);
        
        System.out.println(NilaiChar);
        System.out.println(nilaiBool);
        
        
        
        
    }
    
    }
