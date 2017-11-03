public class QuickFindUF{
    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for(int i = 0;i < N; i++){
            id[i] = i;
        }
    }
    public boolean connected(int p, int q){
        if(id[p] == id[q])
            return true;
        else
            return false;
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i = 0;i < id.length; i++){
            if(id[i] == pid)
                id[i] = qid;
        }
    }
    public static void main(String[] args){
        QuickFindUF q = new QuickFindUF(10);
        q.union(0,5);
        q.union(1,4);
        q.union(0,1);
        System.out.println(q.connected(0, 4));
    }
}