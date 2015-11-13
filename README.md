>>> SEND
destination:/app/hello
content-length:18

{"name":"jooyong"}


<<< MESSAGE
destination:/topic/greetings
content-type:application/json;charset=UTF-8
subscription:sub-0
message-id:v4k72c69-22
content-length:28

{"content":"Hello,jooyong!"}