/*******************************************************************************
 * MIT License
 *
 * Copyright (c) 2019 Softblue
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/
package insider.strings;

public class Main {

	public static void main(String[] args) {
		
		//String s1 = "abc";
		//String s2 = "abc";
		//System.out.println(s1);
		//System.out.println(s2);
		
		String s1 = "abc";
		String s2 = new String("abc");
		
		System.out.println(s1);
		System.out.println(s2);
		
		if (s1 == s2) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
		
		if (s1.equals(s2)) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
	}
}
