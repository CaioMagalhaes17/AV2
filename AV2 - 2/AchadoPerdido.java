public class AchadoPerdido {
    static String titulo, descricao, foto, tipo, local_achado, data_hora, status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public static void completaDados(String foto, String local_achado, String data_hora){
        AchadoPerdido.foto = foto;
        AchadoPerdido.local_achado = local_achado;
        AchadoPerdido.data_hora = data_hora;
    }

    public boolean BuscarTitulo(String titulo){
        if (this.titulo.equals(titulo)){
            return true;
        }
        return false;
    }

    public String visualizarDetalhes(){
        return "Título: " + this.titulo + "\nDescrição: " + this.descricao + "\nTipo: " + this.tipo + "\nStatus: " + this.status +
                "\nFoto: " + this.foto + "\nLocal Achado: " + this.local_achado + "Data e hora: " + this.data_hora;
    }
}
