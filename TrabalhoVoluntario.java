public class TrabalhoVoluntario {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String tipoTrabalho, int duracaoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }
    public boolean validaProjeto(){
        if(duracaoTrabalho>2){
            return true;
        }
        else
            return false;

    }

    public String imprimeProjeto(){
        return getTipoTrabalho()+getDuracaoTrabalho();
    }




}
