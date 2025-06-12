// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         // If the input array of strings is empty, there's no common prefix,
//         // so we immediately return an empty string.
//         if (strs == null || strs.length == 0) {
//             return "";
//         }

//         // Initialize 'prefix' with the first string in the array.
//         // We'll progressively shorten this 'prefix' until it is a common prefix
//         // of all subsequent strings.
//         String prefix = strs[0];

//         // Iterate through the rest of the strings in the array, starting from the second one.
//         // We compare 'prefix' with each string to find the longest common part.
//         for (int i = 1; i < strs.length; i++) {
//             // This loop continues as long as 'prefix' is NOT at the beginning of strs[i].
//             // strs[i].indexOf(prefix) returns 0 if 'prefix' is found at the beginning of strs[i].
//             // If it returns anything other than 0 (e.g., -1 if not found, or a positive index if found elsewhere),
//             // it means 'prefix' is too long or not a starting prefix of strs[i].
//             while (strs[i].indexOf(prefix) != 0) {
//                 // If 'prefix' is not at the beginning of strs[i], we shorten 'prefix' by one character
//                 // from the end. We're effectively trying a shorter potential common prefix.
//                 prefix = prefix.substring(0, prefix.length() - 1);

//                 // If 'prefix' becomes an empty string during the shortening process,
//                 // it means there's no common prefix at all among the strings.
//                 // In this case, we can stop and return an empty string immediately.
//                 if (prefix.isEmpty()) {
//                     return "";
//                 }
//             }
//         }

//         // After iterating through all strings, the remaining 'prefix' will be
//         // the longest common prefix among all the input strings.
//         return prefix;
//     }
// }