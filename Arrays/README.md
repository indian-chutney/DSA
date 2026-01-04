## Encode and Decode:

- The goal of this problem is to basically encode a list into a string. and then decode this string to get original value.

- Length-prefix encoding works by writing each string as <length>#<string>, so the decoder first reads characters until # to get the length, then reads exactly that many characters as the string. This removes all ambiguity because decoding never depends on what characters appear inside the string — even # is safe, since it’s treated as data, not a separator. The key insight (my “eureka”) is that once the length is known, the payload can contain anything and we don’t need escaping, hashing, or special checks. This makes the solution simple, deterministic, and reversible for any list of strings, including empty ones.
