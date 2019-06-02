package com.ht.link;

 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Test01 {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null)return null;

        RandomListNode currentCode = pHead;
        //复制每个节点
        while(currentCode!=null){
            RandomListNode cloneNode = new RandomListNode(currentCode.label);
            RandomListNode nextNode = currentCode.next;
            cloneNode.next = nextNode;
            currentCode.next = cloneNode;
            currentCode = nextNode;
        }

        currentCode = pHead;
        //为复制随机指针
        while(currentCode!=null){
            RandomListNode cloneNode = currentCode.next;
            cloneNode.random = currentCode.random==null?null:currentCode.random.next;
            currentCode = currentCode.next.next;
        }

        //拆分出新旧链表
        currentCode = pHead;
        RandomListNode pCloneNode = pHead.next;
        while(currentCode!=null){
            RandomListNode cloneNode = currentCode.next;
            currentCode.next = currentCode.next.next;
            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
            currentCode = currentCode.next;

        }
        return pCloneNode;

    }
}
