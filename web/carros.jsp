<%@taglib uri="/struts-tags" prefix="s"%><br/> 

<div id="cadastroform" >
                    <s:form action="carroUser" method="post" class="">
                     <!-- <legend>Cadastrar Membro</legend>  <br/><br/>   -->             
	<s:select label="What's your favor search engine" 
		headerKey="-1" headerValue="Select Search Engines"
		list="searchEngine" 
		name="yourSearchEngine" />
 
                      <s:textfield label="ano" name="ano" value="ano" />
                      <s:textfield label="modelo" name="modelo" value="modelo" />  
                      <s:textarea label="foto" name="comentario"  cols="42" rows="5"/>
                      <s:hidden name="idCarro" value="idCarro" />
                      <s:submit label="comentar" value="comentar"/>
                      


                      
                      
                      
                    </s:form>
                      <!--<img style="margin-top: -80px;" src="imagens/cadastrarfacebook_1.png"/>-->
                 </div> 
