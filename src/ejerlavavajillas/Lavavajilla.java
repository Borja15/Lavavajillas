
package ejerlavavajillas;


public class Lavavajilla {
    /**
     * Clase Lavavajilla que funcionara como un electrodomestico que 
     * se enciende y apaga,usa diferentes tipos de programas y los muestra.
     */
    private boolean encendido;
    private boolean abierto;
    private int programa;
       
    public static final int ENJUAGADO = 0;   
    public static final int PRELAVADO = 1;    
    public static final int LAVADO = 2;  
    public static final int ACLARADO = 3;
    public static final int SECADO = 4;
    
    /**
     * Método constructor con la puerta cerrada y apagado.El programa inicial 
     * sera el de "Enjuagado"
     */
    public Lavavajilla() {
        abierto = false;
        encendido = false;
        programa = ENJUAGADO;
    }
    
    /**
     * Método constructor con la puerta cerrada y encendido.
     * @param programa Programa de lavado ejecutandose
     */
    public Lavavajilla(int programa) {
        abierto = false;
        encendido = true;
        this.programa = programa;
    }

    /**
     * Método que abre la puerta y apaga el lavavajilla
     * @param abierto Indicara si se abre o se cierra.
     */
    public void setAbierto(boolean abierto) {
       this.abierto = abierto;
        if(abierto) {
            setEncendido(false);
        }else{
            setEncendido(true);
        }
    }
        
    /**
     * Método que nos indica si se encuentra abierta o cerrada..
     */
    public String getAbierto() {
        if(abierto) {
            return "Abierta";
        } else {
            return "Cerrada";
        }
    }

    /**
     * Método que indica si esta encendido o apagado
     */
    public String getEncendido() {
        if(encendido) {
            return "Encendido";
        } else {
            return "Apagado";
        }
    }

    /**
     * Método que enciende o apaga el lavavajilla.Si se encuentra abierta la 
     * puerta no se encendera
     * @param encendido boolean que indica si se enciende
     */
    public void setEncendido(boolean encendido) {
        if(!abierto) {
            this.encendido = encendido;
        }
    }

    /**
     * Método que indica el programa de lavado ejecutandose
     */
    public String getPrograma() {
        switch(programa) {
            case ENJUAGADO:
                return "Enjuagado";
            case PRELAVADO:
                return "Prelavado";
            case LAVADO:
                return "Lavado";
            case ACLARADO:
                return "Aclarado";
            case SECADO:
                return "Secado";
        }
        return "";
    }

    /**
     * Método para poner un programa de lavado
     * @param programa Programa de lavado que queremos poner
     */
    public void setPrograma(int programa) {
        if(encendido){
             this.programa = programa;
        }
       
    }
        
    /**
     * Método que avanza automaticamente.
     * Si el lavavajillas se encuentra encendido y se encuentra en un programa 
     * anteior al ultimmo(Secado),avanzara un programa mas.
     */
    public void avanzarPrograma() {
        if(encendido) {
            if(programa<4) {
                programa++;
            }
        }
    }

}
