curl -X POST 'https://api.dify.ai/v1/completion-messages' \
  --header "Authorization: Bearer ${singleStoryKey}" \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "inputs": {"feature": "xxx", "story_list": "作为购物中心电影观众，我想要提前预订电影场次相关的食物，以便于节省购买食物的时间，更好地安排观影时间", "story": "xxxx"},
      "response_mode": "streaming",
      "user": "phodal"
  }'
