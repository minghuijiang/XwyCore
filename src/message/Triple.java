/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

/**
 * 
 * @author Ming Jiang
 * @param <A>   key
 * @param <B>   subkey
 * @param <C>   obj
 */
public class Triple<A,B,C> {
    private A key;
    private B subKey;
    private C obj;
    
    public Triple(A a, B b, C c){
        key = a;
        subKey = b;
        obj = c;
    }

    /**
     * @return the key
     */
    public A getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(A key) {
        this.key = key;
    }

    /**
     * @return the subKey
     */
    public B getSubKey() {
        return subKey;
    }

    /**
     * @param subKey the subKey to set
     */
    public void setSubKey(B subKey) {
        this.subKey = subKey;
    }

    /**
     * @return the obj
     */
    public C getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(C obj) {
        this.obj = obj;
    }
    
    
    @Override
    public String toString(){
        return "key : "+key+" subkey : "+subKey+" obj : "+obj;
    }
}
