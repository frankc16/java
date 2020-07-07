package enumera;
public enum continentes {
    AFRICA(65),
    AMERICA(50),
    OCEANIA(34);
    
    public final int paises;
    
    continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
           return paises;
    
    }
}
