# ClinicaVet
AV2 trabalho prático
Faculdade Lourenço Filho

Desenvolvimento de Sistema 2

Avaliação 2

 

Dado o modelo de classes conceitual e o diagrama de objetos, seu objetivo é criar um projeto com Spring que atenda os requisitos:

 

Implementar o modelo de classes conceitual;

Realizar a persistência do modelo em banco com Hibernate;

Instanciar os objetos de acordo com o diagrama de objetos;

Disponibilizar os end points:

/especies/{id} deve carregar a espécie e os animais associados;

/consultas/{id} deve carregar a consulta, o veterinario, o animal e seu dono.

O projeto deve ser implementado em sincronia com o repositório remoto no github, através de commits incrementais. Dica: divida o projeto em pequenos passos, cada passo concluído e testado vira um commit. por exemplo: 

passo 1: Iniciar o projeto no STS;

passo 2: Testar a comunicação REST;

Passo 3: implementar a classe Especie e sua persistência;

passo 4: implementar o relacionamento especie e animal, verificando o resultado no banco;

passo 5: disponibilizar o endpoint /especies/{id}

etc..
