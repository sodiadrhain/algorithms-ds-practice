/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
 var isSubsequence = function(s, t) {
    if (s==="") {
        return true;
    }
    s = s.toLowerCase();
    t = t.toLowerCase();
    let res = '';
    
    for (let i=0; i<s.length; i++) {
       for (let j=0; j<t.length; j++) {
           if (s.charAt(i) === t.charAt(j)) {
               res = res.concat(t.charAt(j))
           }
       }
    }
    
    return res===s ? true : false;

};