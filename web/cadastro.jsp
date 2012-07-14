<%@taglib uri="/struts-tags" prefix="s"%><br/> 

<div id="cadastroform" >
                    <s:form action="cadastroUser" method="post" class="">
                      <legend>Cadastrar Membro</legend>  <br/><br/>                
                      <s:textfield label="Nome" name="" value="nome" />
                      <s:textfield label="Usuário" name="usuario" />
                      <s:password label="Password" name="password" />
                      <s:textfield label="E-mail" name="email" />
                      <s:submit label="Cadastrar" value="Cadastrar"/>
                    </s:form>
                      <img style="margin-top: -80px;" src="imagens/cadastrarfacebook_1.png"/>
                 </div> 
