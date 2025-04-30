N, M = map(int, input().split())

# 상태 저장: [P 값, M 값]
status = [[None, None] for _ in range(N + 1)]  # index 1부터 시작

for _ in range(M):
    a, b, c = input().split()
    a = int(a)
    c = int(c)
    if b == 'P':
        status[a][0] = c  # P 정보
    else:
        status[a][1] = c  # M 정보

min_count = 0
max_count = 0

for i in range(1, N + 1):
    P, M = status[i]

    if P == 1 and M == 0:
        # 무조건 식물
        min_count += 1
        max_count += 1
    elif M == 1:
        # 운동성이 있으면 식물 아님
        continue
    elif P == 1 or (P == 1 and M is None) or (P is None and M == 0) or (P is None and M is None):
        # 식물일 가능성 있음
        max_count += 1

print(min_count, max_count)