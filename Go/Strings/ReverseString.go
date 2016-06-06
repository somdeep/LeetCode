func reverseString(s string) string {
    //fmt.Printf(s);
	var chars = []rune(s);
	for i, j := 0, len(chars)-1; i < j; i, j = i+1, j-1 {
		chars[i], chars[j] = chars[j], chars[i]
	}
	return string(chars);
	
}