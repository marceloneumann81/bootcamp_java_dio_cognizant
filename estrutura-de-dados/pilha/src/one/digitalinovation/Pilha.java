package one.digitalinovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;  //referencia para criar o nó como null para depois apontar corretamente
    }

    public No top(){
        return refNoEntradaPilha; //retorna somente a refeencia do topo
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha; // recebe a referência de topo
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);  //seta a referencia de topo com o refAuxiliar (antiga referência)
    }

    public No pop(){
    if( ! this.isEmpty()){
        No noPoped = refNoEntradaPilha;
        refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        return noPoped;
        }
        return null;

    }

    public boolean isEmpty(){
//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "---------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxilar = refNoEntradaPilha;

        while (true){
            if(noAuxilar != null){
                stringRetorno += "[No{dado=" + noAuxilar.getDado() + "}]\n";
                noAuxilar = noAuxilar.getRefNo();

            }else{
                break;
            }


        }
        stringRetorno += "---------------";
        return  stringRetorno;
    }

}
