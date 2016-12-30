webservice 文档地址
http://localhost:8888/jax/AccountService?WSDL

生成客户端jar
wsimport -clientjar client.jar http://localhost:8888/jax/AccountService?WSDL

客户端 还存在bug
AccountClient.java 