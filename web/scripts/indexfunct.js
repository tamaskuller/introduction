/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

                //var mainURL=document.URL;
                var mainURL="http://tamaskuller.uw.hu/";   
                var directory="pictureshow/";
                var pictureShowMenus= ["Travels", "Jobs"];
                var pictureShowID="PictureShow";               
                var Files=["JRE/jsecmed.exe","JRE/jexcadd.exe","JRE/jre-8u11-windows-x64.exe",
                "CV/Tamas_Kuller_CV-2019.docx", "CV/Tamas_Kuller_CV-2019.docx","pictureshow_exe/PictureShow-Jobs.exe","pictureshow_exe/PictureShow-Travels.exe"];
                var Linkes=["https://github.com/tamaskuller/introduction","https://github.com/tamaskuller/pictureshow"]
                var FileIDs=["jse","jex","jre","intro:CV", "CV2", "Jobs_exe", "Travels_exe"];                                          
                var LinkIDs=["intro:Webpage","pictShow"];                                          
                    
           function getFilesURLsQ(){               
                    for (var i = 0; i < Files.length; i++) {                        
                        if (document.getElementById(FileIDs[i])!==null)
                            {
                                document.getElementById(FileIDs[i]).href=mainURL+Files[i];                    
                            }                   
                    }                    
                    for (var i = 0; i < Linkes.length; i++) {                        
                        if (document.getElementById(LinkIDs[i])!==null)
                            {
                                document.getElementById(LinkIDs[i]).href=Linkes[i];                    
                            }                   
                    }                                        
           }
           
            
            function setPictureShowHRefs(action)
            {       
                if (action)
                {                
                    for (var i = 0; i < pictureShowMenus.length; i++) {                        
                        var element=document.getElementById(pictureShowID+":"+pictureShowMenus[i]);
                        element.href=mainURL+directory+pictureShowMenus[i]+".jnlp";                     
                        element.onclick=null;                        
                    }
                } 
                                
            }
            
            
            
            function getHRef(element)
            {
                return mainURL+directory+element+".jnlp";       
            }
            
           
           function getMainURL()
           {
           return mainURL;}
           