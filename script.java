const botoes = document.querySelectorAll("botao");

for(let i=0;i <botoes.length;j++{
    botoes[i].onclik = function(){

        for(let j=0<botoes.length;j++){
           botoes[j].classlist.remove("ativo");
        }
        botoes[i].classlist.add("ativo");
    }
    
