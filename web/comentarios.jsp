<%@taglib uri="/struts-tags" prefix="s"%><br/> 

<div id="cadastroform" >
                    <s:form action="comentarioUser" method="post" class="">
                     <!-- <legend>Cadastrar Membro</legend>  <br/><br/>   -->             
 
                      <s:textfield label="Nome" name="nomeCompleto" value="nome" />
                      <s:textfield label="Email" name="mail" value="seu@mail.com" />  
                      <s:textarea label="Comentário" name="comentario"  cols="42" rows="5"/>
                      <s:hidden name="idCarro" value="idCarro" />
                      <s:submit label="comentar" value="comentar"/>
                    </s:form>
                      <!--<img style="margin-top: -80px;" src="imagens/cadastrarfacebook_1.png"/>-->
                 </div> 
