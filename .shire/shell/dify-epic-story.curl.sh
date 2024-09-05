curl -X POST 'https://api.dify.ai/v1/completion-messages' \
  --header "Authorization: Bearer ${epicStory}" \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "inputs": {"feature": "Hello, world!", "story_list": "作为购物中心电影观众，我想要提前预订电影场次相关的食物，以便于节省购买食物的时间，更好地安排观影时间。", "story": "添加零食和饮料至购物车影院观众在购票时添加零食和饮料提前准备好观影期间的零食和饮料"},
      "response_mode": "streaming",
      "user": "phodal"
  }'
