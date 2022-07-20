class Solution {
  public int countPoints(String rings) {
      int[] red = new int[10];
      int[] blue = new int[10];
      int[] green = new int[10];

      for (int i = 0; i < rings.length(); i += 2) {
          char c = rings.charAt(i);
          int position = rings.charAt(i + 1) - '0';
        
          if(c == 'R') {
              red[position]++;
          }
        
          if(c == 'B') {
              blue[position]++;
          }
        
          if(c == 'G') {
              green[position]++;
          }
      }
      
      int counter = 0;
      for (int i = 0; i < 10; i++) {
          if (red[i] > 0 && blue[i] > 0 && green[i] > 0) {
              counter++;
          }
      }

      return counter;
  }
}