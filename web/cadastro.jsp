<%@taglib uri="/struts-tags" prefix="s"%><br/> 

<div id="cadastroform" >
                    <s:form action="cadastroUser" method="post" class="">
                      <legend>Cadastrar Membro</legend>  <br/><br/>                
 
                      <s:textfield label="Usuário" name="usuario" value="usuário" />
                      <s:password label="Password" name="password" value="nome" />
                      <s:textfield label="Nome" name="nomeCompleto" value="nome" />
                      <s:textfield label="Email" name="mail" value="seu@mail.com" />                    
                      <s:submit label="Cadastrar" value="Cadastrar"/>
                    </s:form>
                      <img style="margin-top: -80px;" src="imagens/cadastrarfacebook_1.png"/>
                 </div> 
