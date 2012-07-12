<%@taglib uri="/struts-tags" prefix="s"%><br/> 

<div id="cadastroform" >
                    <s:form action="logon" method="post" class="">
                      <legend>Cadastrar Membro</legend>  <br/><br/>                
                      <s:textfield label="Nome" name="" />
                      <s:textfield label="Usuário" name="" />
                      <s:password label="Password" name="" />
                      <s:textfield label="E-mail" name="" />
                      <s:submit label="Cadastrar" value="Cadastrar"/>
                    </s:form>
                      <img style="margin-top: -80px;" src="imagens/cadastrarfacebook_1.png"/>
                 </div> 
