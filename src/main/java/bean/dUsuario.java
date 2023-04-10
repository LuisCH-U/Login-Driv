package bean;

public class dUsuario {
    String EMAIL;
    String PASS;
    String NOMBRE;
    

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
    
    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public dUsuario() {
    }

    public dUsuario(String EMAIL, String PASS, String NOMBRE) {
        this.EMAIL = EMAIL;
        this.PASS = PASS;
        this.NOMBRE = NOMBRE;
    }
    
}

