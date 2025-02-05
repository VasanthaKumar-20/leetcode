class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        int n=sandwiches.length;
        for(int i=0;i<n;i++)
        {
            queue.add(students[i]);
        }
        int i=0,r=0;
        while(!queue.isEmpty())
        {
            if(queue.peek()==sandwiches[i])
            {
                queue.poll();
                i++;
                r=0;
            }
            else
            {
                queue.add(queue.poll());
                r++;
            }
            if(r==queue.size())
            {
                break;
            }
        }   
        return queue.size();
    }
}