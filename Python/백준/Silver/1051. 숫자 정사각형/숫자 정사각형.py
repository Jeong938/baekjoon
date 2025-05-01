def find_largest_square(N, M, grid):
    # 가장 큰 정사각형의 크기 초기화
    max_size = 1
    
    # 각 좌표 (i, j)에서 가능한 모든 정사각형 크기 검사
    for i in range(N):
        for j in range(M):
            # 가능한 정사각형 크기 확인
            for size in range(1, min(N - i, M - j) + 1):
                # i, j를 왼쪽 상단 꼭짓점으로 하는 정사각형의 네 꼭짓점 확인
                if i + size < N and j + size < M:  # 범위 체크
                    if (grid[i][j] == grid[i + size][j] == 
                        grid[i][j + size] == grid[i + size][j + size]):
                        max_size = max(max_size, (size + 1) ** 2)
    
    return max_size

# 입력 받기
N, M = map(int, input().split())
grid = [list(map(int, input().strip())) for _ in range(N)]  # 각 숫자를 정수로 처리

# 결과 출력
print(find_largest_square(N, M, grid))
