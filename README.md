# Project articlestore

Esse projeto foi desenvolvido para colocar em prática conhecimentos sobre o uso de sessions e cookies no desenvolvimento de aplicações web utilizando JavaServer Pages (JSP) e Servlets.

O projeto consiste em uma aplicação que permite que usuários acessem algumas opções de arquivos em txt, após realizarem cadastro na página. Não se trata de registro para autenticação e posterior login. Se trata apenas de se registrarem para realizar o download. No entanto, o desafio foi desenvolver de forma que o usuário se registre apenas uma vez. Após primeiro registro, não deverá ser mais necessário realizar novo registro para acessar um segundo arquivo. A aplicação deverá reconhecer que o usuário já está registrado.

## Funcionamento do sistema

Quando o usuário visita o sistema pela primeira vez, ele acessa uma tela inicial com a lista de categorias de arquivos. Quando o usuário seleciona uma das categorias, ele é redirecionado para uma tela de registro. O usuário fornece seus dados pessoais e o sistema permite o seu acesso à categoria de arquivos desejada. O usuário será redirecionado para uma página contendo uma lista dos arquivos disponíveis, dentro da categoria selecionada. O usuário terá permissão para acessar o arquivo.

Se o usuário retornar para a página inicial e solicitar uma segunda categoria de arquivos, não será mais necessário realizar o seu registro. Ele será direcionado para a categoria desejada e terá permissão para acessar os arquivos.

## Solução do problema

Quando o usuário realiza seu registro, a seção do usuário é recuperada e o sistema busca por um atributo (user). Se o sistema encontrar o user, ele automaticamente terá permissão para acessar os arquivos solicitados. Se não houver user definido na seção atual do usuário, o sistema buscará por um cookie (emailCookie) no navegador do usuário. Se o sistema encontrar o cookie, um user será definido automaticamente, a partir da leitura de um arquivo .txt contendo os dados de primeiro nome e último nome do email registrado na primeira visita do usuário ao sistema. Assim, com user definido dentro da seção, o usuário terá acesso aos arquivos solicitados.

Se o usuário estiver visitando o sistema pela primeira vez, quando ele realizar o seu registro, os dados informados no registro serão utilizados para criar um user, na seção, e serão armazenados em um arquivo .txt, no servidor. Um cookie será criado e armazenará o e-mail do usuário. O cookie criado é nomeado como emailCookie e é adicionado no objeto HttpServletResponse e enviado para o navegador do usuário. Esse cookie será armazenado no navegador do usuário por dois anos. Em um próximo acesso, o cookie estará visível para toda a aplicação.

O projeto é simples, mas agregou bastante em minha formação como desenvolvedor. Ótimo projeto para ter um primeiro contato com sessions e cookies.