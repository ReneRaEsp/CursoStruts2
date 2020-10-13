package beans.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
    private String usuario;
    private String password;

    @Override
    public String execute(){
        return SUCCESS;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getTitulo(){
        return getText("titulo");
    }
    
    public String getUsuarioV(){
        return getText("usuarioV");
    }
    public String getPasswordV(){
        return getText("passwordV");
    }
    public String getBoton(){
        return getText("boton");
    }
    public String getValorUsuario(){
        return getText("valorUsuario");
    }
    public String getValorPassword(){
        return getText("valorPassword");
    }
    
}
