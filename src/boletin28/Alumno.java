package boletin28;

import javax.swing.JOptionPane;

public class Alumno {

    private String nome="Damian";
    private int nota=8;
    private Enderezo enderezo;
    Enderezo en = new Enderezo();

    public Alumno() {
        
    }

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }
    
    public void cambiarNota(){
        int notaActual = this.getNota();
        JOptionPane.showMessageDialog(null,"Nota Actual: "+notaActual);
        this.setNota(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la nueva nota")));
        
    }
    
    public void amosar(){
        System.out.println(this.getNome()+", "+this.getNota()+", "+en.getRua()+", "+en.getNumero());
    }
    
    
    
    
    private class Enderezo{
        private String rua="Florida";
        private int numero=45;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }
        
    }
}
