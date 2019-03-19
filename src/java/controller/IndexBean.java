/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Named;


/**
 *
 * @author Tamas Kuller
 */
@Named(value="indexBean")
@SessionScoped
public class IndexBean implements Serializable{
    private int centerMenu;        
    private boolean readMeOK;
    private boolean readMeToRead;
    private String[] centerMenuNames={"00_intro.xhtml","01_whoiam.xhtml","02_motivation.xhtml","03_education.xhtml",
        "04_positions.xhtml","05_projects.xhtml","06_PictureShow.xhtml","07_JRE.xhtml","",""};
    private UIComponent component;
   
    /**
     * Creates a new instance of indexBean
     */
    public IndexBean() {
        setCenterMenu(0);  
        readMeOK=false;
        readMeToRead=false;
    }

    public UIComponent getComponent() {
        return component;
    }

    public void setComponent(UIComponent component) {
        this.component = component;
    }
    
  
    
    public int getCenterMenu() {
        return centerMenu;
    }

    
    public void setCenterMenu(int centerMenu) {                
        this.centerMenu = centerMenu;
        System.out.println("centermenu:"+centerMenu);
    }

    public String getCenterMenuName() {
        return centerMenuNames[centerMenu];
    }
    
    public boolean isReadMeOK() {         
        return readMeOK;
    }

    public void setReadMeOK(boolean readMeRead) {
        this.readMeOK = readMeRead;   
        System.out.println("readmeread:"+readMeRead);
    }

    public boolean isReadMeToRead() {
        return readMeToRead;
    }

    public void setReadMeToRead(boolean readMeToRead) {
        this.readMeToRead = readMeToRead;
        System.out.println("readmetoread:"+readMeToRead);
    }

    
    public void startApps()
    {
        System.out.println("startapps"+readMeOK);
        if (!readMeOK)   
            menuJREOpen();
            
    }
    
    public void readOk()
    {
        System.out.println("readok");
        readMeToRead=false;
        readMeOK=true;
        setCenterMenu(6);   
        
    }
    
   public void menuJREOpen()
   {
       System.out.println("menuJREOpen");
       setCenterMenu(7);           
       if (!readMeOK)
            setReadMeToRead(true);        
   }
        
    
    
    
    
}
